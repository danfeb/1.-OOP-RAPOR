public class Rapor
{
	private String nama;
	private String kelas;
	private int semester;
	// private String pelajaran1;
	// private int nilaiPel1;
	// private String pelajaran2;
	// private int nilaiPel2;
	// private String pelajaran3;
	// private int nilaiPel3;
	// private int average;
	// private int a,b;

	// Rapor()
	// {
	// 	this.nama = "BELUM TERISI";
	// 	this.kelas = "BELUM TERISI";
	// 	this.semester = 0;
	// 	this.pelajaran1= "BELUM TERISI";
	// 	this.nilaiPel1= 0;
	// 	this.pelajaran2= "BELUM TERISI";
	// 	this.nilaiPel2= 0;
	// 	this.pelajaran3= "BELUM TERISI";
	// 	this.nilaiPel3= 0;
	// 	this.average= 0;
	// }

	// public void Display()
	// {
	// 	System.out.println("--------------------------------------");
	// 	System.out.println("NAMA        =" + this.nama);
	// 	System.out.println("KELAS       =" + this.kelas);
	// 	System.out.println("SEMESTER    =" + this.semester);
	// 	System.out.println("PELAJARAN 1 =" + this.pelajaran1);
	// 	System.out.println("NILAI PEL 1 =" + this.nilaiPel1);
	// 	System.out.println("PELAJARAN 2 =" + this.pelajaran2);
	// 	System.out.println("NILAI PEL 2 =" + this.nilaiPel2);
	// 	System.out.println("PELAJARAN 3 =" + this.pelajaran3);
	// 	System.out.println("NILAI PEL 3 =" + this.nilaiPel3);
	// 	System.out.println("RATA-RATA   =" + this.average);
	// 	System.out.println("--------------------------------------");
	// }

	// public void SetProfile(String nama, String kelas, int semester)
	// {
	// 	this.nama = nama;
	// 	this.kelas = kelas;
	// 	this.semester = semester;
	// }
	// public void SetPelajaran1(String pelajaran1, int nilaiPel1)
	// {
	// 	this.pelajaran1 = pelajaran1;
	// 	this.nilaiPel1 = nilaiPel1;
	// }
	// public void SetPelajaran2(String pelajaran2, int nilaiPel2)
	// {
	// 	this.pelajaran2 = pelajaran2;
	// 	this.nilaiPel2 = nilaiPel2;
	// }
	// public void SetPelajaran3(String pelajaran3, int nilaiPel3)
	// {
	// 	this.pelajaran3 = pelajaran3;
	// 	this.nilaiPel3 = nilaiPel3;
	// }
	// public int GetAverage()
	// {
	// 	a= nilaiPel1 + nilaiPel2 + nilaiPel3;
	// 	b= a/3;
	// 	this.average = b;
	// 	return this.average;
	// }
	private String pel1;
	private String pel2;
	private String pel3;
	// String[] pel = new String[3];
	String[] pelajaran = new String[3];
	Rapor()
	{
		this.nama = "BELUM TERISI";
		this.kelas = "BELUM TERISI";
		this.semester = 0;
		// this.pelajaran[0] = "BELUM TERISI";
		// this.pelajaran[1] = "BELUM TERISI";
		// this.pelajaran[2] = "BELUM TERISI";
		for(int i=0; i<3; i++)
		{
			this.pelajaran[i] = "BELUM TERISI";
		}
	}


	public void Display()
	{
		System.out.println("--------------------------------------");
		System.out.println("NAMA        =" + this.nama);
		System.out.println("KELAS       =" + this.kelas);
		System.out.println("SEMESTER    =" + this.semester);
		for(int i=0; i<3; i++)
		{
			System.out.println("PELAJARAN" + (i+1) + 	"=" + this.pelajaran[i]);
		}
	}
	public void SetProfile(String nama, String kelas, int semester)
	{
		this.nama = nama;
		this.kelas = kelas;
		this.semester = semester;
	}
	// public void SetPelajaran(String pel1, String pel2, String pel3)
	// {
	// 	this.pelajaran[0] = pel1;
	// 	this.pelajaran[1] = pel2;
	// 	this.pelajaran[2] = pel3;
	// }

	public void SetPelajaran(String pel) 
	{
		// String[] coba = new String[3];
		// for(int j=0; j<3; j++)
		// {
		// 	coba[j] = pel;
		// }
		// for(int i=0; i<3; i++)
		// {
		// 	this.pelajaran[i] = pel;
		// }

		this.pelajaran = pel;

	}

	public String SetP(String pel)
	{
		for(i=0; i<3;i++)
		{
			pel[i] = pel;
			return
		} 
	}
}