package model;

import java.util.*;

class Usuario {
        private String nome;
        private Int cpf;
        private String email;
        private int telefone;
        private int nascimento;
        private String endereco;

    Usuario(String nome2, Int cpf2, String email2, int nascimento2, int telefone2, String endereco2){
        this.nome = nome2;
        this.cpf = cpf2;
        this.email = email2;
        this.telefone = telefone2;
        this.nascimento = nascimento2;
        this.endereco = endereco2;
    }
    
    public String getNome(){
        return nome;
    }

    public Int getCpf(){
        return cpf;
    }

    public String getEmail(){
        return email;
    }

    public String getEndereco(){
        return endereco;
    }

    public int getNascimento(){
        return nascimento;
    }

    public int getTelefone(){
        return telefone;
    }
}
    
    class CRUD{
        public static void main(String[] args){

            ArrayList<Usuario> c = new ArrayList<Usuario>();
            Scanner s = new Scanner(System.in);
            Scanner s1 = new Scanner(System.in);
            int opcao;
        do{
            System.out.println("1 - CADASTRAR ");
            System.out.println("2 - MOSTRAR ");
            System.out.println("3 - DELETAR ");
            System.out.println("4 - ALTERAR");
            System.out.println("Qual opcao voce vai escolher?");
            opcao = s.nextInt();

            boolean found;
            switch(opcao){
                case 1:
                    System.out.print("Qual seu nome? > ");
                    String nome = s1.nextLine();
                    System.out.print("Qual seu CPF? > ");
                    int cpf = s.nextInt();
                    System.out.print("Qual seu email? >");
                    String email = s1.nextLine();
                    System.out.print("Qual seu telefone? >");
                    int telefone = s.nextInt();
                    System.out.print("Qual sua data de nascimento? > ");
                    int nascimento = s.nextInt();
                    System.out.print("Qual seu endereco? > ");
                    String endereco = s1.nextLine();

                    c.add(new Usuario(nome,cpf,email,telefone,nascimento,endereco));
                break;

                case2:
                    System.out.println("---------------------------");
                    Iterator<Usuario> i = c.iterator();
                    while(i.hasNext()){
                        Usuario e = i.next();
                        System.out.println(e);
                    }
                    System.out.println(c);
                break;

                case3: //delete
                    System.out.println("Escreva qual vai deletar : ");
                    nome = s.nextLine();
                    i = c.iterator();
                    while(i.hasNext()){
                        Usuario e = i.next();
                        if(e.getNome() == nome){
                            i.remove();
                            found = true;
                        }
                    }
                    if(!found){
                        System.out.println("Nome nao encontrado");
                        }else{
                            System.out.println("Usuario deletado !");
                        }
                break;

                case4: //alterar
                    found = false;
                    System.out.print("Qual voce vai mudar? ");
                    nome = s.nextLine();
                    ListIterator<Usuario>li = c.listIterator();
                    while(li.hasNext()){
                        Usuario e = li.next();
                        if(e.getNome() == nome){
                            System.out.println("Coloque o novo nome : ");
                            nome = s1.nextLine();
                            System.out.print("Coloque o novo cpf > ");
                            cpf = s.nextInt();
                            System.out.print("Qual seu novo email? >");
                            email = s1.nextLine();
                            System.out.print("Qual seu novo telefone? >");
                            telefone = s.nextInt();
                            System.out.print("Coloque a nova data de nascimento? > ");
                            nascimento = s.nextInt();
                            System.out.print("Qual seu novo endereco? > ");
                            endereco = s1.nextLine();
                            li.set(new Usuario(nome, cpf, email, endereco, nascimento, telefone));
                            found = true;
                        }
                    }
                    if(!found){
                        System.out.println("Nome nao encontrado");
                    }else{
                        System.out.println("Usuario alterado com sucesso");
                    }
                    
                break;
            }
        }while(opcao!=0);
        
    }   
}

