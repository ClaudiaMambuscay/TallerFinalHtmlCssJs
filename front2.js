const main =()=> {
    let option = document.querySelector('#frutas');
    option.addEventListener("click",colores)
    
}

const informacion=()=>{
    //fuente: https://jsfiddle.net/3q1L9yp5/
        
    var formulario = document.querySelector(".nombre");
    
    // escuchamos el evento submit y si surge ejecutamos una función
    formulario.addEventListener('submit', function(ev) {

    // deshabilitamos el comportamiento por defecto de submit
        ev.preventDefault();

    // capturamos los datos del formulario
    var datos = new FormData(formulario);
        
    // Mostramos las [claves, valores] capturados en consola
    
    for(var pair of datos.entries()) {
        console.log(pair[0]+ ': '+ pair[1]);
    }
    
    })
}

const colores =()=>{
    let opcion = document.querySelector('#frutas');
    let tema = document.querySelector('.tema1');
    let par = document.querySelectorAll('.par');
    let impar = document.querySelectorAll('.impar');
    let fruta = document.querySelector('.fotoFruta')
    
    if (opcion.value > "0"){
        num = opcion.value%2;
        
        if(num ==0){
            
            tema.classList.add("temaFrutas2");
            fruta.classList.add("fotoFrutaPar");
            console.log(opcion.value);
            tema.classList.remove("temaFrutas1");
            fruta.classList.remove("fotoFrutaImpar");
            par.forEach((cadaPar,i)=>{
                par[i].classList.add("par_activo");
            })
            impar.forEach((cadaImpar,i)=>{
                impar[i].classList.remove("impar_activo");
            })

        } else if(num!=0) {
            console.log(opcion.value);
            tema.classList.add("temaFrutas1");
            fruta.classList.add("fotoFrutaImpar");
            tema.classList.remove("temaFrutas2");
            fruta.classList.remove("fotoFrutaPar");
            impar.forEach((cadaImpar,i)=>{
                impar[i].classList.add("impar_activo");
            })
            par.forEach((cadaPar,i)=>{
                par[i].classList.remove("par_activo");
            })
        }
    } else{
            tema.classList.add("temaFrutas");
            fruta.classList.add("fotoFruta");
            console.log(opcion.value);
            tema.classList.remove("temaFrutas1");
            fruta.classList.remove("fotoFrutaImpar");
            tema.classList.remove("temaFrutas2");
            fruta.classList.remove("fotoFrutaPar");
    }
}

const  mostrar =()=>{ /*fuente:https://www.youtube.com/watch?v=XGyTnLoGOX0&t=679s */
    const bloque = document.querySelectorAll('.bloque');
    const title = document.querySelectorAll('.titulo');
    const subtitle = document.querySelectorAll('.subtitulo')
    const bloque2 = document.querySelectorAll('.bloque2')

    title.forEach((cadaH2 , i)=>{
        title[i].addEventListener('click', ()=>{
            bloque.forEach((cadaBloque, i)=>{
                bloque[i].classList.remove('activo');
            })
            bloque[i].classList.add('activo');
            subtitle.forEach((cadaH3 , i)=>{
                subtitle[i].addEventListener('click', ()=>{
                    bloque2.forEach((cadaBloque2, i)=>{
                    bloque2[i].classList.remove('activo');
                })
                bloque2[i].classList.add('activo');
    
         })

     })
            
        })

    })

    
    
}
