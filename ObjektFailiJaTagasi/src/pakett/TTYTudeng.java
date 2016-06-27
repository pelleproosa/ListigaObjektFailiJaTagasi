package pakett;

@SuppressWarnings("serial")
public class TTYTudeng extends Student{
	private String ttylisainfo="";
	private int IQ=0;
	
	public String toString() {
		return "Antud isik studeerib TTY-s";
	}
	
	public TTYTudeng() {
		super("TTY");
	}

	public String getTtylisainfo() {
		return ttylisainfo;
	}

	public void setTtylisainfo(String ttylisainfo) {
		this.ttylisainfo = ttylisainfo;
	}

	public int getIQ() {
		return IQ;
	}

	public void setIQ(int iQ) {
		IQ = iQ;
	}

}
