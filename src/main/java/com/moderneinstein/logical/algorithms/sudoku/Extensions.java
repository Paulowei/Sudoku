package com.moderneinstein.core.algorithms ;  
import java.util.LinkedList ;
import java.util.Arrays ; 
import java.io.Serializable ;
import java.util.HashMap ; 
import java.util.function.* ;
public class Extensions{
 public static Integer[][][] resolve(Integer[][] filt){
        int var1 = filt.length;
        int var2 = filt[0].length;
        int count1;
        Integer[][][] var3 = new Integer[var1][var2][var2];
        for(int i=0;i<var1;i++){
            for(int j=0;j<var2;j++){
                for(int k=0;k<var2;k++){
                    if(filt[i][j]!=0){
                    var3[i][j][0]=filt[i][j];
                    }
                    else{
                        var3[i][j][0]=0;
                    }
                }
            }
        }
        for(int i =0;i<var1;i++){
            for(int j =0;j<var2;j++){
                count1=0;
                for(int k=1;k<=var2;k++){
                    Integer[][] var4 = Filter.filter3(filt,k);
                    if(var4[i][j]==k){
                        var3[i][j][count1]=k;
                        count1++;
                    }
                }
            }
        }
        return var3;
    }
public static void guess(Integer[][] filt,int a,int b,int c){
        int var1 = filt.length;
        int var2 = filt[0].length;
        Integer[][][] var3 = resolve(filt);
        //for(int i=0;i<var1;i++){
            //for(int j=0;j<var2;j++){
                if(var3[a][b].length<=3){
                    int var4 = var3[a][b][c];
                    //var3[i][j]=new Integer[]{var3[i][j][0]};
                    filt[a][b]=var4;
                }
            //}
        //}
    }
 //public static void update(char[][] board){

    //}
    public static boolean singleCell(Integer[][] filt,int a, int b){
        int var1 = filt.length;
        int var2 = filt[0].length;
        int count1=0;
        int count2=0;
        int count3=0;
        int var3 = 0;
        Boolean state = null;
        for(int f=0;f<var1;f++){
            //for(int j=0;j<var2;j++){f
                if(filt[a][b]==filt[a][f]&&b!=f){
                    count1++;
                    //continue;
                    //return false;
                }
            }
            for(int g=0;g<var1;g++){
            if(filt[a][b]==filt[g][b]&&a!=g){
                    count2++;
                    //continue;
                    //return false;
                }
                
           // }
        }
        if(count1<1){
            return true;
        }
        if(count2<1){
            return true;
        }
        
                if(a%3==0 && b%3==0){
                    for(int k = 0;k <= 2;k++){
                        for(int l = 0;l <=2 ;l++){
                            if(filt[a][b]==filt[a+k][b+l]&&(((k+l)+(k*l))!=0)){
                                var3=1;
                            }      
                        }
                    }
                }
                if(a%3==1 && b%3==0){
                    for(int k = -1;k <= 1;k++){
                        for(int l = 0;l <=2 ;l++){
                            if(filt[a][b]==filt[a+k][b+l]&&(((k+l)+(k*l))!=0)){
                                var3=1;
                            }
                        }
                    }
                }
                if(a%3==2 && b%3==0){
                    for(int k = -2;k <= 0;k++){
                        for(int l = 0;l <=2 ;l++){
                           if(filt[a][b]==filt[a+k][b+l]&&(((k+l)+(k*l))!=0)){
                               var3=1;
                           }
                        }
                    }
                }
                if(a%3==0 && b%3==1){
                    for(int k = 0;k <= 2;k++){
                        for(int l = -1;l <= 1 ;l++){
                            if(filt[a][b]==filt[a+k][b+l]&&(((k+l)+(k*l))!=0)){
                                var3=1;
                            }
                        }
                    }
                }
                if(a%3==1 && b%3==1){
                    for(int k = -1;k <= 1 ;k++){
                        for(int l = -1;l <= 1 ;l++){
                            if(filt[a][b]==filt[a+k][b+l]&&(((k+l)+(k*l))!=0)){
                                 var3=1;
                            }
                        }
                    }
                }
                if(a%3==2 && b%3==1){
                    for(int k = -2;k <= 0;k++){
                        for(int l = -1;l <= 1 ;l++){
                            if(filt[a][b]==filt[a+k][b+l]&&(((k+l)+(k*l))!=0)){
                                var3=1;
                            }
                        }
                    }
                }
                if(a%3==0 && b%3==2){
                    for(int k = 0;k <= 2;k++){
                        for(int l = -2;l <=0 ;l++){
                            if(filt[a][b]==filt[a+k][b+l]&&(((k+l)+(k*l))!=0)){
                                var3=1;
                            }
                        }
                    }
                }
                if(a%3==1 && b%3==2){
                    for(int k = -1;k <= 1 ;k++){
                        for(int l = -2;l <= 0 ;l++){
                            if(filt[a][b]==filt[a+k][b+l]&&(((k+l)+(k*l))!=0)){
                             var3=1;
                            }
                        }
                    }
                }                
                if(a%3==2 && b%3==2){
                    for(int k = -2;k <= 0;k++){
                        for(int l = -2;l <=0 ;l++){
                            if(filt[a][b]==filt[a+k][b+l]&&(((k+l)+(k*l))!=0)){
                                var3=1;
                            }
                        }
                        }
                    }
        count3+=var3;
        if(count3<1){
            return true;
        } 
        //if(count1==0||count2==0||count3==0){
        //    return true;
        //}
        //else{
        //    return false;
        //}
        //return true;
            return false;}
}