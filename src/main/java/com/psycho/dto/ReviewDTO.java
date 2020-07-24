package com.psycho.dto;

import java.security.Timestamp;

public class ReviewDTO {

		private int pt_num;
		private int pt_rnum;
		private String pt_rtitle;
		private String pt_rcontent;
		private Timestamp pt_rdate;
		private int pt_rviewcnt;
		
		public ReviewDTO() {
			super();
		}
		
		public ReviewDTO(int pt_num, int pt_rnum, String pt_rtitle, String pt_rcontent, Timestamp pt_rdate, int pt_rviewcnt) {
			super();
			this.pt_num = pt_num;
			this.pt_rnum = pt_rnum;
			this.pt_rtitle = pt_rtitle;
			this.pt_rcontent = pt_rcontent;
			this.pt_rdate = pt_rdate;
			this.pt_rviewcnt = pt_rviewcnt;
		}

		public int getPt_num() {
			return pt_num;
		}

		public void setPt_num(int pt_num) {
			this.pt_num = pt_num;
		}

		public int getPt_rnum() {
			return pt_rnum;
		}

		public void setPt_rnum(int pt_rnum) {
			this.pt_rnum = pt_rnum;
		}

		public String getPt_rtitle() {
			return pt_rtitle;
		}

		public void setPt_rtitle(String pt_rtitle) {
			this.pt_rtitle = pt_rtitle;
		}

		public String getPt_rcontent() {
			return pt_rcontent;
		}

		public void setPt_rcontent(String pt_rcontent) {
			this.pt_rcontent = pt_rcontent;
		}

		public Timestamp getPt_rdate() {
			return pt_rdate;
		}

		public void setPt_rdate(Timestamp pt_rdate) {
			this.pt_rdate = pt_rdate;
		}

		public int getPt_rviewcnt() {
			return pt_rviewcnt;
		}

		public void setPt_rviewcnt(int pt_rviewcnt) {
			this.pt_rviewcnt = pt_rviewcnt;
		}
		
		
}
