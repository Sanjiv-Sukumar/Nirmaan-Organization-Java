package set;

import java.util.*;

public class Sets implements Comparable<Sets>{
	
	int id;
	String name;
	
	public Sets(int id , String name){
		this.id = id;
		this.name = name;
	}
	
	
	
	


	@Override
	public String toString() {
		return "Sets [id=" + id + ", name=" + name + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public int compareTo(Sets o) {
		// TODO Auto-generated method stub
		if(this.id < o.id) {
			return -1;
		} else if (this.id > o.id) {
			return 1;
		}
		return 0;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sets other = (Sets) obj;
		return id == other.id;
	}






	public static void main(String[] args) {
		
		Set<Sets> set = new HashSet<Sets>();
		
		Sets student1 = new Sets(2,"Sanjiv");
		set.add(student1);
		Sets student2 = new Sets(1,"Loki");
		set.add(student2);
		Sets student3 = new Sets(3,"Balaji");
		set.add(student3);
		Sets student7 = new Sets(7,"Balaji");
		set.add(student7);
		Sets student4 = new Sets(4,"Bajji");
		set.add(student4);
		Sets student5 = new Sets(5,"Bala");
		set.add(student5);
		Sets student6 = new Sets(6,"Inba");
		set.add(student6);
		
		System.out.println(set);
		
		//LinkedHashSet
		
		Set<Sets> Lset = new LinkedHashSet<Sets>();
		
		Sets lStudent1 = new Sets(2,"Sanjiv");
		Lset.add(lStudent1);
		Sets lStudent2 = new Sets(1,"Loki");
		Lset.add(lStudent2);
		Sets lStudent3 = new Sets(3,"Balaji");
		Lset.add(lStudent3);
		Sets lStudent4 = new Sets(7,"Balaji");
		Lset.add(lStudent4);
		Sets lStudent5 = new Sets(4,"Bajji");
		Lset.add(lStudent5);
		
		System.out.println(Lset);
		
		
		//TreeSet
		Set<Sets> Tset = new TreeSet<Sets>();
		
		Sets TStudent1 = new Sets(2,"Sanjiv");
		Tset.add(TStudent1);
		Sets TStudent2 = new Sets(1,"Loki");
		Tset.add(TStudent2);
		Sets TStudent3 = new Sets(3,"Balaji");
		Tset.add(TStudent3);
		Sets TStudent4 = new Sets(7,"Balaji");
		Tset.add(TStudent4);
		Sets TStudent5 = new Sets(4,"Bajji");
		Tset.add(TStudent5);
		
		System.out.println(Tset);
		
		
	}

}
