package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	private BoardMapper mapper;
	
	@Test
	public void testInsert() {
		BoardVO board = new BoardVO();
		board.setTitle("title6");
		board.setContent("test6");
		board.setWriter("user6");
		
		mapper.insert(board);
		
	}

	public BoardMapper getMapper() {
		return mapper;
	}

	public void setMapper(BoardMapper mapper) {
		this.mapper = mapper;
	}
}
