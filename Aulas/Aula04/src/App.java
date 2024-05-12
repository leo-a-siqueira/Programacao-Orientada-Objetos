public Class App{
    public static void main(String[], args){
        Alteta atleta = new Atleta();
        atleta.nome = "Davi";
        atleta.esporte = "Futebol";
        atleta.char = "M";
        atleta.idade = 15;
        atleta.altura = 180;
        atleta.peso = 85.5;
        atleta.velocidade = 10;


        Time time = new Time();
        time.nome = "São Paulo";
        time.tem_estadio = true;
        time.estadio = "Morumbis";
        time.pais_origem = "Brasil";
        time.estado = "São Paulo";
        time.cidade = "São Paulo";
        time.fundacao = 1930;
        time.torcida = 212000000;
        time.atletas.add(atleta1);

        
    }
}