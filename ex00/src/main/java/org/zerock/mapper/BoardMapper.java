package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardMapper {
	//@Select("select * from tbl_board where id > 0")
	public List<BoardVO> getList();

	public void insert(BoardVO board);
}
