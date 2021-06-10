package kosta.web.mvc.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import kosta.web.mvc.board.domain.FreeBoard;

public interface FreeBoardRepository extends JpaRepository<FreeBoard, Long> {
   /**
    * 조회수 증가 (JPQL문법)
    * */
	@Query("update FreeBoard b set b.readnum=b.readnum+1 where b.bno=?1")
	@Modifying // DDL , DML할때 필수 
	void readnumUpdate(Long freeBno);
}
