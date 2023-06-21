//package com.example.moderneinstein.core;
package com.moderneinstein.core.algorithms ; 
import java.util.LinkedList ;
import java.util.Arrays ; 
import java.io.Serializable ;
import java.util.HashMap ; 
import java.util.function.* ; 
import java.io.File ;
import java.io.InputStream ; 
import java.io.FileInputStream ;  
import java.io.FileOutputStream; 
import java.io.OutputStreamWriter ; 
import java.io.InputStreamReader ; 
import java.io.BufferedWriter ; 
import java.io.BufferedReader ;
import java.io.FileNotFoundException ; 
import java.io.IOException   ; 
import java.io.* ;
/**
 * Hello world!
 */
public  class App {
    public File file1 = null; 
    String[][] string1 = null ; 
    char[][] char1  = null ; 

    public App(File file2) {
        this.file1 = file2 ;
        try{
        InputStream isr = new FileInputStream(file2) ;
        System.setIn(isr) ;
        }catch(FileNotFoundException exp){
            exp.printStackTrace() ;
        }
	string1 = new String[9][9] ;
	char1 =  new char[9][9] ;
	System.gc() ;
    }
public void solvePuzzle(){
    try{
    this.string1 = null ; 
    InputStream stream = new FileInputStream(this.file1) ;
    InputStreamReader isr  = new InputStreamReader(stream) ; 
    BufferedReader reader1 = new BufferedReader(isr) ; 
    int count1   = 0  ; 
    String[] array1 = null ; 
    String str1 = new String("") ; 
    while(count1<9){
        str1 = reader1.readLine() ;
        array1 = str1.split(",") ;
        this.string1[count1] = array1 ;
        count1 = count1+1 ; 
    }
    Sudoku sudoku  = new Sudoku() ; 
    sudoku.solveSudoku(this.string1) ; 
}catch( IOException exp){
    exp.printStackTrace()  ; 
}
}
void placePuzzle(){
try{
//this.string1 = null ; 
OutputStream stream1 = new FileOutputStream(this.file1) ;
OutputStreamWriter writer1 = new OutputStreamWriter(stream1) ;
BufferedWriter buffered1 = new BufferedWriter(writer1) ;
int count1 = 0 ; 
String str1 = null ;
int digit1 = this.string1.length ; 
String[] string2 = null ; 
while(count1<digit1){
  string2 = this.string1[count1] ;
	int digit2 = string2.length ; 
	for(int c=0;c<digit2;c++){
	str1 = string2[c] ;
	buffered1.write(str1) ;
	buffered1.write(",")  ;
	
}
	buffered1.write("/n") ; 
	count1++ ;
}
}catch(IOException exp){
	exp.printStackTrace() ; 
	}

}
void placePuzzle(String str1){
try{
//this.string1 = null ; 
OutputStream stream1 = new FileOutputStream(this.file1) ;
OutputStreamWriter writer1 = new OutputStreamWriter(stream1) ;
BufferedWriter buffered1 = new BufferedWriter(writer1) ;
int count1 = 0 ; 
String str2 = null ;
int digit1 = this.string1.length ; 
String[] string2 = null ; 
//while(count1<digit1)
	for(int v=0;v<digit1;v++){
  string2 = this.string1[v] ;
	int digit2 = string2.length ; 
	for(int c=0;c<digit2;c++){
	str1 = string2[c] ;
	buffered1.write(str1) ;
	buffered1.write(",")  ;
	
}
	buffered1.write("/n") ; 
//	count1++ ;
}
}catch(IOException exp){
	exp.printStackTrace() ; 
	}

}
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        if(args.length>0){
        String str1 = args[0] ; 
        File newFile = new File(str1) ;
        App app1 = new App(newFile) ; 
        Integer int1 = null ; 
        String[][] board = new String[9][9] ;
	app1.solvePuzzle() ; 
	app1.placePuzzle() ; 
	
      //  System.out.println("Hello World!"); 
        }
        else{
	
        }
    }
}
