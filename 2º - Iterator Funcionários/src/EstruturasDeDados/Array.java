package EstruturasDeDados;
import Iterator.Funcionarios;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Array {
         String linha;
         ArrayList<Funcionarios> DadosFuncionarios = new ArrayList<>(); 
         public Iterator LerArray(){
         try{
             BufferedReader br = new BufferedReader(new FileReader("Funcionarios.txt"));
           int pos=0;
            while((linha=br.readLine())!=null){
                Funcionarios aux = new Funcionarios(linha);
                DadosFuncionarios.add(aux);
                pos++;
            }
            br.close();
         }catch(IOException e){
            System.out.println("ERRO . . . " + e);
        }
             return DadosFuncionarios.iterator(); 
         }
}