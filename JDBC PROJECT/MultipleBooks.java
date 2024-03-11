package com.pojo;

import java.util.ArrayList;

import com.pojo.Database.Database;

public class MultipleBooks {
private ArrayList<Book> list;

public MultipleBooks() {
	this.list=new ArrayList<Book>();
}
public void setToList(Book b)
{
	list.add(b);
}
public void SaveData()
{
	Database.save(list);
}
 
}
