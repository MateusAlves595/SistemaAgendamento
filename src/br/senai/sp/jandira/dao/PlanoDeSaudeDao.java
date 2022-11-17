package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PlanoDeSaudeDao {
    
    private final static String URL = "C:\\Users\\22282205\\Java\\PlanoDeSaude.txt";
    private final static String URL_TEMP = "C:\\Users\\22282205\\Java\\PlanoDeSaude-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);
    
    private static ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();
    
    public static void criarListaDePlanosDeSaude() {
       
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            String linha = leitor.readLine();
            
            while(linha != null) {
                
                String[] vetor = linha.split(";");
                PlanoDeSaude p = new PlanoDeSaude(vetor[1],
                        vetor[2],
                        vetor[3],
                        LocalDate.parse(vetor[4]),
                        Integer.valueOf(vetor[0]));
                planosDeSaude.add(p);
                linha = leitor.readLine();
            }
            
            leitor.close();
            
        } catch (IOException p) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao ler o arquivo");

        }
              
    }
    
    public static DefaultTableModel getTabelaPlanoDeSaude() {
        String[] titulos = {"Código", "Número", "Operadora", "Categoria", "Validade"};
        String[][] dados = new String[planosDeSaude.size()][5];
        
        for(PlanoDeSaude p : planosDeSaude){
            int i = planosDeSaude.indexOf(p);
            dados[i][0] = p.getCodigo().toString();
            dados[i][1] = p.getNumero();
            dados[i][2] = p.getOperadora();
            dados[i][3] = p.getCategoria();
            
            DateTimeFormatter barra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            
            dados[i][4] = p.getValidade().format(barra);
            
            
        }
        return new DefaultTableModel(dados, titulos);
    }
    
    
    //metodos
    public static ArrayList<PlanoDeSaude> getPlanosDeSaude() {
        return planosDeSaude;
    }
    
    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) {
        for(PlanoDeSaude p : planosDeSaude){
            if (p.getCodigo() == codigo){
                return p;
            }
        }
        
        return null;
    } 
        
    public static void gravar(PlanoDeSaude p) {
        planosDeSaude.add(p);
        
        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            escritor.write(p.getPlanoDeSaudeSeparado());
            escritor.newLine();
            escritor.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Aconteceu um erro");
        }
    }
    
    public static void excluir(Integer codigo) {
        for(PlanoDeSaude p : planosDeSaude){
            if (p.getCodigo() == codigo){
                planosDeSaude.remove(p);
                break;
            }
        }
        atualizarArquivo();
    }
    private static void atualizarArquivo() {
        //Passo 1 - Criar uma representação dos arquivos que serão manipulados
            File arquivoAtual = new File(URL);
            File arquivoTemp = new File(URL_TEMP);

            try {
                //Criar o arquivo temporario
                arquivoTemp.createNewFile();

                //Abrir o arquivo temporário para escrita
                BufferedWriter bwTemp = Files.newBufferedWriter(
                        PATH_TEMP,
                        StandardOpenOption.APPEND,
                        StandardOpenOption.WRITE);

                //Iterar na lista para adicionar as especialidades 
                //no arquivo temporário, exceto o registro que
                //não queremos mais
                for (PlanoDeSaude p : planosDeSaude) {
                    bwTemp.write(p.getPlanoDeSaudeSeparado());
                    bwTemp.newLine();
                }
                
                bwTemp.close();
                
                arquivoAtual.delete();
                
                arquivoTemp.renameTo(arquivoAtual);

            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    
    public static void atualizar(PlanoDeSaude planoAtualizado) {
         for(PlanoDeSaude p : planosDeSaude){
            if (p.getCodigo() == planoAtualizado.getCodigo()){
               planosDeSaude.set(planosDeSaude.indexOf(p), planoAtualizado);
                break;
            }
        }
         atualizarArquivo();
    }
    
    
    
}
