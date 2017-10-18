package org.zerock.service;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

import java.util.List;

public interface BoardService {
    void regist(BoardVO board) throws Exception;

    BoardVO read(Integer bno) throws Exception;

    void modify(BoardVO board) throws Exception;

    void remove(Integer bno) throws Exception;

    List<BoardVO> listAll() throws Exception;

    List<BoardVO> listCriteria(Criteria cri) throws Exception;

    public int countPaging(Criteria cri) throws Exception;
}
