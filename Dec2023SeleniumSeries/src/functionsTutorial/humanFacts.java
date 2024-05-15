package functionsTutorial;

public class humanFacts {
	
	String name;
	int age;
	String pincode;
	//static String legcount;

	public static void main(String[] args) {
		
		humanFacts hfs1 = new humanFacts();
		hfs1.name = "Bala1";
		hfs1.age = 35;
		hfs1.pincode = "600079";
		//humanFacts.legcount = "Testing";
		
		System.out.println(hfs1.name);
		System.out.println(hfs1.age);
		System.out.println(hfs1.pincode);
		
		System.out.println("-------------");
		
		humanFacts hfs2 = new humanFacts();
		hfs2.name = "Bala2";
		hfs2.age = 36;
		hfs2.pincode = "600080";
		
		System.out.println(hfs2.name);
		System.out.println(hfs2.age);
		System.out.println(hfs2.pincode);
		
		System.out.println("-------------");
		
		humanFacts hfs3 = new humanFacts();
		hfs3.name = "Bala3";
		hfs3.age = 37;
		hfs3.pincode = "600081";
		
		System.out.println(hfs3.name);
		System.out.println(hfs3.age);
		System.out.println(hfs3.pincode);
		
		System.out.println("-------------");
		
		humanFacts hfs4 = new humanFacts();
		hfs4.name = "Bala4";
		hfs4.age = 38;
		hfs4.pincode = "600082";
		
		System.out.println(hfs4.name);
		System.out.println(hfs4.age);
		System.out.println(hfs4.pincode);
		
		System.out.println("-------------");
		
		humanFacts hfs5 = new humanFacts();
		hfs5.name = "Bala5";
		hfs5.age = 39;
		hfs5.pincode = "600083";
		
		System.out.println(hfs5.name);
		System.out.println(hfs5.age);
		System.out.println(hfs5.pincode);
		
		System.out.println("----hfs1 mapped with hfs2---------");
		
		hfs1 = hfs2;
		
		System.out.println(hfs1.name);
		System.out.println(hfs1.age);
		System.out.println(hfs1.pincode);
		
		System.out.println(hfs2.name);
		System.out.println(hfs2.age);
		System.out.println(hfs2.pincode);
		
		System.out.println(hfs3.name);
		System.out.println(hfs3.age);
		System.out.println(hfs3.pincode);
		
		System.out.println(hfs4.name);
		System.out.println(hfs4.age);
		System.out.println(hfs4.pincode);
		
		System.out.println(hfs5.name);
		System.out.println(hfs5.age);
		System.out.println(hfs5.pincode);
		
		System.out.println("------hfs2 mapped with hfs3-------");
		
		hfs2 = hfs3;
		
		System.out.println(hfs1.name);
		System.out.println(hfs1.age);
		System.out.println(hfs1.pincode);
		
		System.out.println(hfs2.name);
		System.out.println(hfs2.age);
		System.out.println(hfs2.pincode);
		
		System.out.println(hfs3.name);
		System.out.println(hfs3.age);
		System.out.println(hfs3.pincode);
		
		System.out.println(hfs4.name);
		System.out.println(hfs4.age);
		System.out.println(hfs4.pincode);
		
		System.out.println(hfs5.name);
		System.out.println(hfs5.age);
		System.out.println(hfs5.pincode);
		
		System.out.println("------hfs3 mapped with hfs4-------");
		
		hfs3 = hfs4;
		
		System.out.println(hfs1.name);
		System.out.println(hfs1.age);
		System.out.println(hfs1.pincode);
		
		System.out.println(hfs2.name);
		System.out.println(hfs2.age);
		System.out.println(hfs2.pincode);
		
		System.out.println(hfs3.name);
		System.out.println(hfs3.age);
		System.out.println(hfs3.pincode);
		
		System.out.println(hfs4.name);
		System.out.println(hfs4.age);
		System.out.println(hfs4.pincode);
		
		System.out.println(hfs5.name);
		System.out.println(hfs5.age);
		System.out.println(hfs5.pincode);
		
		System.out.println("------hfs4 mapped with hfs5-------");
		
		hfs4 = hfs5;
		
		System.out.println(hfs1.name);
		System.out.println(hfs1.age);
		System.out.println(hfs1.pincode);
		
		System.out.println(hfs2.name);
		System.out.println(hfs2.age);
		System.out.println(hfs2.pincode);
		
		System.out.println(hfs3.name);
		System.out.println(hfs3.age);
		System.out.println(hfs3.pincode);
		
		System.out.println(hfs4.name);
		System.out.println(hfs4.age);
		System.out.println(hfs4.pincode);
		
		System.out.println(hfs5.name);
		System.out.println(hfs5.age);
		System.out.println(hfs5.pincode);
		
		hfs5 = hfs1;
		System.out.println("------hfs5 mapped with hfs1-------");
		
		System.out.println(hfs1.name);
		System.out.println(hfs1.age);
		System.out.println(hfs1.pincode);
		
		System.out.println(hfs2.name);
		System.out.println(hfs2.age);
		System.out.println(hfs2.pincode);
		
		System.out.println(hfs3.name);
		System.out.println(hfs3.age);
		System.out.println(hfs3.pincode);
		
		System.out.println(hfs4.name);
		System.out.println(hfs4.age);
		System.out.println(hfs4.pincode);
		
		System.out.println(hfs5.name);
		System.out.println(hfs5.age);
		System.out.println(hfs5.pincode);
		
		

	}

}
