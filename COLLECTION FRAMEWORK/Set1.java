
package com.Set;

import java.util.HashSet;

public class Set1 {
public static void main(String[] args) {
	HashSet set = new HashSet();
	set.add(100);
	set.add(200);
	set.add(300);
	set.add(400);
	set.add(400);
	System.out.println(set);
	set.add(null);
	set.add(null);
	System.out.println(set);
	System.out.println(set.containsAll(set));
System.out.println(set.contains(400));
System.out.println(set.remove(300));
System.out.println(set.size());
System.out.println(set.isEmpty());
System.out.println(set.toArray());
System.out.println(set.retainAll(set));
System.out.println(set);
}
}
