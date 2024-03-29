package node;

public interface ListNode extends Node{
	// 새로 수정된 ListNode
	Node car();
	ListNode cdr();
	
	static ListNode cons(Node head, ListNode tail){
		return new ListNode(){
			@Override
			public Node car() {
				return head;
			}
			
			@Override
			public ListNode cdr() {
				return tail;	//tail을 연속적으로 생성
			}
		};
	}
	
	static ListNode EMPTYLIST = new ListNode(){	
		@Override
		public Node car() {
			return null;	
		}	
		
		@Override
		public ListNode cdr() {
			return null;
		}
	};
	
	static ListNode ENDLIST = new ListNode(){
		
		@Override
		public Node car() {
			return null;
		}
		
		@Override
		public ListNode cdr() {
			return null;
		}
	};
}