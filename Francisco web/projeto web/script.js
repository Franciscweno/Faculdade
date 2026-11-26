//Professor aqui vc vai ver a maior burrada de todos os tempos, em vez de criar um array com os objetos dos produtos e inserir com javascript eu criei cada um individualmente no html, eu não pensei nessa opção na hora que montei o html e ja está em cima da hora de entregar o projeto, agora para trabalhar sobre os botões, inputs e labels de cada card eu tive que criar um id diferente para cada conjunto deles em cada card, ainda bem que usei apenas 10 produtos.


//função que calcula o valor total
function calcular(quant, preco){
    return quant * preco
}

// bloco de codigo para tratamento dos elementos do card Pão francês
const valorPaofrances = 0.45;
const botaoCalculoPao = document.getElementById("botaoCalculoPao");
const entradaUsuarioPao = document.getElementById("inputCalculoPao");
const labelPrecoPao = document.getElementById("labelResultadoPao");

botaoCalculoPao.addEventListener('click', () => {
    if(entradaUsuarioPao.value === ""){
        labelPrecoPao.textContent = 'Digite a quantidade para calcular';
        labelPrecoPao.style.fontSize = '10px';
        labelPrecoPao.style.color = '#9600009d';
        setTimeout(() =>{
            labelPrecoPao.textContent = "" }, 3000);
        return;
    }
    
    const qtdPao = parseFloat(entradaUsuarioPao.value);
    
    if(isNaN(qtdPao)){
        labelPrecoPao.textContent = 'Digite apenas números';
        labelPrecoPao.style.fontSize = '10px';
        labelPrecoPao.style.color = '#9600009d';
        setTimeout(() =>{
            labelPrecoPao.textContent = "" }, 3000);
        return;
    }
    
    
    const total = calcular(qtdPao, valorPaofrances);
    labelPrecoPao.textContent = `R$ ${total.toFixed(2).replace('.', ',')}`;
    labelPrecoPao.style.fontSize = '30px';
    labelPrecoPao.style.color = '#104b28';
    
});


// bloco de codigo para tratamento dos elementos do card Pão de queijo
const valorPaoqueijo = 0.95;
const botaoCalculoPaoqjo = document.getElementById("botaoCalculoPaoqjo");
const entradaUsuarioPaoqjo = document.getElementById("inputCalculoPaoqjo");
const labelPrecoPaoqjo = document.getElementById("labelResultadoPaoqjo");

botaoCalculoPaoqjo.addEventListener('click', () => {
    if(entradaUsuarioPaoqjo.value === ""){
        labelPrecoPaoqjo.textContent = 'Digite a quantidade para calcular';
        labelPrecoPaoqjo.style.fontSize = '10px';
        labelPrecoPaoqjo.style.color = '#9600009d';
        setTimeout(() =>{
            labelPrecoPaoqjo.textContent = "" }, 3000);
        return;
    }
    
    const qtdPaoqjo = parseFloat(entradaUsuarioPaoqjo.value);
    
    if(isNaN(qtdPaoqjo)){
        labelPrecoPaoqjo.textContent = 'Digite apenas números';
        labelPrecoPaoqjo.style.fontSize = '10px';
        labelPrecoPaoqjo.style.color = '#9600009d';
        setTimeout(() =>{
            labelPrecoPaoqjo.textContent = "" }, 3000);
        return;
    }
    
    const total = calcular(qtdPaoqjo, valorPaoqueijo);
    labelPrecoPaoqjo.textContent = `R$ ${total.toFixed(2).replace('.', ',')}`;
    labelPrecoPaoqjo.style.fontSize = '30px';
    labelPrecoPaoqjo.style.color = '#104b28';
    
});

// bloco de codigo para tratamento dos elementos do card Pão com gergelim
const valorPaogerg = 0.80;
const botaoCalculoPaogerg = document.getElementById("botaoCalculoPaogerg");
const entradaUsuarioPaogerg = document.getElementById("inputCalculoPaogerg");
const labelPrecoPaogerg = document.getElementById("labelResultadoPaogerg");

botaoCalculoPaogerg.addEventListener('click', () => {
    if(entradaUsuarioPaogerg.value === ""){
        labelPrecoPaogerg.textContent = 'Digite a quantidade para calcular';
        labelPrecoPaogerg.style.fontSize = '10px';
        labelPrecoPaogerg.style.color = '#9600009d';
        setTimeout(() =>{
            labelPrecoPaogerg.textContent = "" }, 3000);
        return;
    }
    
    const qtdPaogerg = parseFloat(entradaUsuarioPaogerg.value);
    
    if(isNaN(qtdPaogerg)){
        labelPrecoPaogerg.textContent = 'Digite apenas números';
        labelPrecoPaogerg.style.fontSize = '10px';
        labelPrecoPaogerg.style.color = '#9600009d';
        setTimeout(() =>{
            labelPrecoPaogerg.textContent = "" }, 3000);
        return;
    }
    
    const total = calcular(qtdPaogerg, valorPaogerg);
    labelPrecoPaogerg.textContent = `R$ ${total.toFixed(2).replace('.', ',')}`;
    labelPrecoPaogerg.style.fontSize = '30px';
    labelPrecoPaogerg.style.color = '#104b28';
    
});

// bloco de codigo para tratamento dos elementos do card Pastel
const valorPastel = 3.98;
const botaoCalculoPastel = document.getElementById("botaoCalculoPastel");
const entradaUsuarioPastel = document.getElementById("inputCalculoPastel");
const labelPrecoPastel = document.getElementById("labelResultadoPastel");

botaoCalculoPastel.addEventListener('click', () => {
    if(entradaUsuarioPastel.value === ""){
        labelPrecoPastel.textContent = 'Digite a quantidade para calcular';
        labelPrecoPastel.style.fontSize = '10px';
        labelPrecoPastel.style.color = '#9600009d';
        setTimeout(() =>{
            labelPrecoPastel.textContent = "" }, 3000);
        return;
    }
    
    const qtdPastel = parseFloat(entradaUsuarioPastel.value);
    
    if(isNaN(qtdPastel)){
        labelPrecoPastel.textContent = 'Digite apenas números';
        labelPrecoPastel.style.fontSize = '10px';
        labelPrecoPastel.style.color = '#9600009d';
        setTimeout(() =>{
            labelPrecoPastel.textContent = "" }, 3000);
        return;
    }
    
    const total = calcular(qtdPastel, valorPastel);
    labelPrecoPastel.textContent = `R$ ${total.toFixed(2).replace('.', ',')}`;
    labelPrecoPastel.style.fontSize = '30px';
    labelPrecoPastel.style.color = '#104b28';
    
});


// bloco de codigo para tratamento dos elementos do card Salgados
const valorSalg = 1;
const botaoCalculoSalg = document.getElementById("botaoCalculoSalg");
const entradaUsuarioSalg = document.getElementById("inputCalculoSalg");
const labelPrecoSalg = document.getElementById("labelResultadoSalg");

botaoCalculoSalg.addEventListener('click', () => {
    if(entradaUsuarioSalg.value === ""){
        labelPrecoSalg.textContent = 'Digite a quantidade para calcular';
        labelPrecoSalg.style.fontSize = '10px';
        labelPrecoSalg.style.color = '#9600009d';
        setTimeout(() =>{
            labelPrecoSuco.textContent = "" }, 3000);
        return;
    }
    
    const qtdSalg = parseFloat(entradaUsuarioSalg.value);
    
    if(isNaN(qtdSalg)){
        labelPrecoSalg.textContent = 'Digite apenas números';
        labelPrecoSalg.style.fontSize = '10px';
        labelPrecoSalg.style.color = '#9600009d';
        setTimeout(() =>{
            labelPrecoSuco.textContent = "" }, 3000);
        return;
    }
    
    const total = calcular(qtdSalg, valorSalg);
    labelPrecoSalg.textContent = `R$ ${total.toFixed(2).replace('.', ',')}`;
    labelPrecoSalg.style.fontSize = '30px';
    labelPrecoSalg.style.color = '#104b28';
    
});


// bloco de codigo para tratamento dos elementos do card Biscoito de queijo
const valorBiscqjo = 1.15;
const botaoCalculobiscqjo = document.getElementById("botaoCalculobiscqjo");
const entradaUsuariobiscqjo = document.getElementById("inputCalculobiscqjo");
const labelPrecobiscqjo = document.getElementById("labelResultadobiscqjo");

botaoCalculobiscqjo.addEventListener('click', () => {
    if(entradaUsuariobiscqjo.value === ""){
        labelPrecobiscqjo.textContent = 'Digite a quantidade para calcular';
        labelPrecobiscqjo.style.fontSize = '10px';
        labelPrecobiscqjo.style.color = '#9600009d';
        setTimeout(() =>{
            labelPrecoSalg.textContent = "" }, 3000);
        return;
    }
    
    const qtdbiscqjo = parseFloat(entradaUsuariobiscqjo.value);
    
    if(isNaN(qtdbiscqjo)){
        labelPrecobiscqjo.textContent = 'Digite apenas números';
        labelPrecobiscqjo.style.fontSize = '10px';
        labelPrecobiscqjo.style.color = '#9600009d';
        setTimeout(() =>{
            labelPrecoSalg.textContent = "" }, 3000);
        return;
    }
    
    const total = calcular(qtdbiscqjo, valorBiscqjo);
    labelPrecobiscqjo.textContent = `R$ ${total.toFixed(2).replace('.', ',')}`;
    labelPrecobiscqjo.style.fontSize = '30px';
    labelPrecobiscqjo.style.color = '#104b28';
    
});


// bloco de codigo para tratamento dos elementos do card MOrtadela
const valorMort = 35.98;
const botaoCalculoMort = document.getElementById("botaoCalculoMort");
const entradaUsuarioMort = document.getElementById("inputCalculoMort");
const labelPrecoMort = document.getElementById("labelResultadoMort");

botaoCalculoMort.addEventListener('click', () => {
    if(entradaUsuarioMort.value === ""){
        labelPrecoMort.textContent = 'Digite a quantidade para calcular';
        labelPrecoMort.style.fontSize = '10px';
        labelPrecoMort.style.color = '#9600009d';
        setTimeout(() =>{
            labelPrecoMort.textContent = "" }, 3000);
        return;
    }
    
    const qtdMort = parseFloat(entradaUsuarioMort.value);
    
    if(isNaN(qtdMort)){
        labelPrecoMort.textContent = 'Digite apenas números';
        labelPrecoMort.style.fontSize = '10px';
        labelPrecoMort.style.color = '#9600009d';
        setTimeout(() =>{
            labelPrecoMort.textContent = "" }, 3000);
        return;
    }
    
    const total = calcular(qtdMort, valorMort);
    labelPrecoMort.textContent = `R$ ${total.toFixed(2).replace('.', ',')}`;
    labelPrecoMort.style.fontSize = '30px';
    labelPrecoMort.style.color = '#104b28';
    
});


// bloco de codigo para tratamento dos elementos do card Mussarela
const valorMuss = 45.90;
const botaoCalculoMuss = document.getElementById("botaoCalculoMuss");
const entradaUsuarioMuss = document.getElementById("inputCalculoMuss");
const labelPrecoMuss = document.getElementById("labelResultadoMuss");

botaoCalculoMuss.addEventListener('click', () => {
    if(entradaUsuarioMuss.value === ""){
        labelPrecoMuss.textContent = 'Digite a quantidade para calcular';
        labelPrecoMuss.style.fontSize = '10px';
        labelPrecoMuss.style.color = '#9600009d';
        setTimeout(() =>{
            labelPrecoMuss.textContent = "" }, 3000);
        return;
    }
    
    const qtdMuss = parseFloat(entradaUsuarioMuss.value);
    
    if(isNaN(qtdMuss)){
        labelPrecoMuss.textContent = 'Digite apenas números';
        labelPrecoMuss.style.fontSize = '10px';
        labelPrecoMuss.style.color = '#9600009d';
        setTimeout(() =>{
            labelPrecoMuss.textContent = "" }, 3000);
        return;
    }
    
    const total = calcular(qtdMuss, valorMuss);
    labelPrecoMuss.textContent = `R$ ${total.toFixed(2).replace('.', ',')}`;
    labelPrecoMuss.style.fontSize = '30px';
    labelPrecoMuss.style.color = '#104b28';
    
});

// bloco de codigo para tratamento dos elementos do card Presunto
const valorPresunto = 42.90;
const botaoCalculoPres = document.getElementById("botaoCalculoPres");
const entradaUsuarioPres = document.getElementById("inputCalculoPres");
const labelPrecoPres = document.getElementById("labelResultadoPres");

botaoCalculoPres.addEventListener('click', () => {
    if(entradaUsuarioPres.value === ""){
        labelPrecoPres.textContent = 'Digite a quantidade para calcular';
        labelPrecoPres.style.fontSize = '10px';
        labelPrecoPres.style.color = '#9600009d';
        setTimeout(() =>{
            labelPrecoPres.textContent = "" }, 3000);
        return;
    }
    
    const qtdPres = parseFloat(entradaUsuarioPres.value);
    
    if(isNaN(qtdPres)){
        labelPrecoPres.textContent = 'Digite apenas números';
        labelPrecoPres.style.fontSize = '10px';
        labelPrecoPres.style.color = '#9600009d';
        setTimeout(() =>{
            labelPrecoPres.textContent = "" }, 3000);
        return;
    }
    
    const total = calcular(qtdPres, valorPresunto);
    labelPrecoPres.textContent = `R$ ${total.toFixed(2).replace('.', ',')}`;
    labelPrecoPres.style.fontSize = '30px';
    labelPrecoPres.style.color = '#104b28';
    
});

// bloco de codigo para tratamento dos elementos do card suco
const valorSuco = 11.99
const botaoCalculoSuco = document.getElementById("botaoCalculoSuco");
const entradaUsuarioSuco = document.getElementById("inputCalculoSuco");
const labelPrecoSuco = document.getElementById("labelResultadoSuco");

botaoCalculoSuco.addEventListener('click', () => {
    if(entradaUsuarioSuco.value === ""){
        labelPrecoSuco.textContent = 'Digite a quantidade para calcular';
        labelPrecoSuco.style.fontSize = '10px';
        labelPrecoSuco.style.color = '#9600009d';
        setTimeout(() =>{
            labelPrecoSuco.textContent = "" }, 3000);
        return;
    }
    
    const qtdSuco = parseFloat(entradaUsuarioSuco.value);
    
    if(isNaN(qtdSuco)){
        labelPrecoSuco.textContent = 'Digite apenas números';
        labelPrecoSuco.style.fontSize = '10px';
        labelPrecoSuco.style.color = '#9600009d';
        setTimeout(() =>{
            labelPrecoSuco.textContent = "" }, 3000);
        return;
    }
    
    const total = calcular(qtdSuco, valorSuco);
    labelPrecoSuco.textContent = `R$ ${total.toFixed(2).replace('.', ',')}`;
    labelPrecoSuco.style.fontSize = '30px';
    labelPrecoSuco.style.color = '#104b28';
    
});

//Tratamento e validação do formulário de contato
const labelMsgenv = document.getElementById('msgEnv');
const botaoContato = document.getElementById('botaoContato');
const campoNome = document.getElementById('inputNome')
const campoAssunto = document.getElementById('inputAssunto')
const campoMsg = document.getElementById('textarea')

function mostrarMsgEnv(){
    if(/\d/.test(campoNome.value)){
        labelMsgenv.textContent = 'O nome não pode conter números!';
        labelMsgenv.style.fontSize = '20px';
        labelMsgenv.style.color = '#a71717';
    }

    else if(campoNome.value === "" || campoAssunto.value === "" || campoMsg.value === ""){
        labelMsgenv.textContent = 'Todos os campos devem ser preenchidos!';
        labelMsgenv.style.fontSize = '20px';
        labelMsgenv.style.color = '#a71717';
    }


    else{
        labelMsgenv.textContent = 'Mensagem Enviada';
        labelMsgenv.style.fontSize = '20px';
        labelMsgenv.style.color = '#104b28';
    }

    setTimeout(() =>{
        labelMsgenv.textContent = ""}, 3000);
}

botaoContato.addEventListener('click', () => {
    mostrarMsgEnv();

})


