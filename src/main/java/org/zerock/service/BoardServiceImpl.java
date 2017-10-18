package org.zerock.service;

import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.persistence.BoardDAO;

import javax.inject.Inject;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Inject
    private BoardDAO dao;

    @Override
    public void regist(BoardVO board) throws Exception {
        dao.create(board);
    }

    @Override
    public BoardVO read(Integer bno) throws Exception {
        return dao.read(bno);
    }

    @Override
    public void modify(BoardVO board) throws Exception {
        dao.update(board);
    }

    @Override
    public void remove(Integer bno) throws Exception {
        dao.delete(bno);
    }

    @Override
    public List<BoardVO> listAll() throws Exception {
        return dao.listAll();
    }

    @Override
    public List<BoardVO> listCriteria(Criteria cri) throws Exception {
        return dao.listCriteria(cri);
    }

    @Override
    public int countPaging(Criteria cri) throws Exception {
        return dao.countPaging(cri);
    }

}
