package src.Informatics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayO {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        boolean b=false;
        arr.add(1);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(1);
        arr.add(1);
        arr.add(2);
        int c=0,exb=0,d=0;
        boolean b1=false;
        while(b==false){
          if(arr.get(c)==arr.get(c+1)){
              while(b1){
                  if(arr.get(c)==arr.get(d+1)){
                      exb++;

                  } else b1=true;
                  d++;
              }
              if(exb>=3){
                  for(int i=c;i<c+exb;i++){
                      arr.remove(i);
                  }
              }
          }
        c++;
        }
    }
}

