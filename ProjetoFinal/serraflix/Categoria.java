package serraflix;

public enum Categoria {
	FANTASIA("FANTASIA"), TERROR("TERROR"), COMEDIA("COMEDIA");

	private String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	private Categoria(String code) {
		this.setCode(code);
	}

	public static Categoria getEnum(String code) {

		switch (code) {
		case "FANTASIA":
			return Categoria.FANTASIA;
		case "TERROR":
			return Categoria.TERROR;
		case "COMEDIA":
			return Categoria.COMEDIA;
		default:
			return null;
		}

	}
}