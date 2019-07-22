package parser;


public enum TokenType {
	INT,
	ID, QUESTION,
	TRUE, FALSE, NOT,
	PLUS, MINUS, TIMES, DIV,
	LT, GT, EQ, APOSTROPHE,
	L_PAREN, R_PAREN,
	DEFINE, LAMBDA, COND, QUOTE,
	CAR, CDR, CONS,
	ATOM_Q, NULL_Q, EQ_Q;
	
	//State.START.transit()���� switch �����ؼ� 
	static TokenType fromSpecialCharactor(char ch) {
	
		switch ( ch ) {
		//���� Ư������ 
		//�������̰� �ʿ���� -> START���� �ٷ� MATCHED ������ �����־�� ��
		case '(':
			return TokenType.L_PAREN;
		case ')':
			return TokenType.R_PAREN;
		case '+':
			return TokenType.PLUS;
		case '-':
			return TokenType.MINUS;
		case '*':
			return TokenType.TIMES;
		case '/':
			return TokenType.DIV;
		case '<':
			return TokenType.LT;
		case '=':
			return TokenType.EQ;
		case '>':
			return TokenType.GT;	
		case '\'':
			return TokenType.APOSTROPHE;
		//���� ǥ������ �����Ͽ� ch�� ��Ī�Ǵ� keyword�� ��ȯ�ϴ� case�� �ۼ�

		default:
			throw new IllegalArgumentException("unregistered char: " + ch);
			}

	}
}