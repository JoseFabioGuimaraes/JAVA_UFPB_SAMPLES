var k = 0;
var maiorAltura = 0;
var menorAltura = 3.00;
var numeroMulheres = 0;
var numeroHomens
var mediaMasculinaAltura = 0;
parseFloat(mediaMasculinaAltura);
while(k <2){
    k++
    var altura = prompt("Digite sua Altura: ");
    var sexo = prompt("Digite seu sexo: ");

    if(altura>maiorAltura){
        maiorAltura = altura
    }
    if(altura<menorAltura){
        menorAltura = altura
    }
    if(sexo=="F"){
        numeroMulheres+=1
    }
    if(sexo =="M"){
        numeroHomens += 1
        parseFloat(altura)
        mediaMasculinaAltura += altura
    }


}
console.log("Quantidade de mulheres igual a: "+numeroMulheres);
console.log("A maior altura é: "+maiorAltura);
console.log("Já a menor é: "+menorAltura);
console.log("E a media de altura dos homens é igual a: "+mediaMasculinaAltura);
