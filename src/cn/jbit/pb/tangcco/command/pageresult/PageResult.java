package cn.jbit.pb.tangcco.command.pageresult;

public class PageResult {

	//��ǰҳ
	private int pageNumber;
	//ÿҳ��ʾ������
	private int pageSize;
	//�ܼ�¼��
	private int totalPosts;
	//��ҳ����
	private int totalPages;
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalPosts() {
		return totalPosts;
	}
	public void setTotalPosts(int totalPosts) {
		this.totalPosts = totalPosts;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	
}
