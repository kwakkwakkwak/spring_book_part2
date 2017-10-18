package org.zerock.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.persistence.BoardDAO;
import org.zerock.service.BoardService;
import org.zerock.service.BoardServiceImpl;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class BoardServiceTest {

    @Inject
    private BoardService dao;

    private static Logger logger = LoggerFactory.getLogger(BoardServiceTest.class);

    @Test
    public void testCreate() throws Exception {
        BoardVO board = new BoardVO();
        board.setTitle("새로운 글을 넣습니다.");
        board.setContent("새로운 글을 넣습니다.");
        board.setWriter("user00");
        dao.regist(board);
    }

    @Test
    public void testRead() throws Exception {
        logger.info(dao.read(3).toString());
    }

    @Test
    public void testModify() throws Exception{
        BoardVO board = new BoardVO();
        board.setBno(4);
        board.setTitle("수정된 글을 넣sss습니다.");
        board.setContent("수정 테스트.");
        dao.modify(board);
    }

    @Test
    public void testRemove() throws Exception{
        dao.remove(3);
    }

}
