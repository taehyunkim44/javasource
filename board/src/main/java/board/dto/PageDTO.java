package board.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// 페이지 나누기와 관련된 정보를 담을 객체
@AllArgsConstructor
@Getter
@Setter
public class PageDTO {
	// 화면에 보여줄 첫번째 페이지 번호
	private int startPage;
	// 화면에 보여줄 마지막 페이지 번호
	private int endPage;
	// 이전 부분을 보여줄 것인지 여부
	private boolean prev;
	// 다음 부분을 보여줄 것인지 여부
	private boolean next;

	// 전체 게시물 수
	private int total;

	// 검색어, 검색기준, 현재 페이지번호, 현재 페이지에 보여줄 게시물 개수
	private SearchDTO searchDto;

	public PageDTO(int total, SearchDTO searchDto) {
		this.total = total;
		this.searchDto = searchDto;

		// 현재 페이지가 3일 때
		// endPage = 10, startPage = 1

		// 현재 화면의 마지막 페이지 수
		endPage = (int) (Math.ceil(searchDto.getPage() / 10.0)) * 10;

		// 현재 화면의 시작 페이지 수
		startPage = endPage - 9;

		// 끝나는 페이지 다시 계산
		// 전체 게시물 개수가 90개일 때 끝나는 페이지는 9로 수정
		int realEnd = (int) (Math.ceil((total / 1.0) / searchDto.getAmount()));

		if (realEnd < this.endPage) {
			this.endPage = realEnd;
		}

		// 이전 / 다음 버튼 활성화
		this.prev = this.startPage > 1;
		this.next = this.endPage < realEnd;

	}
}
