package board.dto;

import lombok.Data;

@Data
public class SearchDTO {
	private String criteria;
	private String keyword;

	// 페이지 나누기
	private int page; // 현재 페이지 번호
	private int amount; // 한 페이지당 보여줄 게시물 수

	public SearchDTO(int page, int amount) {
		super();
		this.page = page;
		this.amount = amount;
	}

}
