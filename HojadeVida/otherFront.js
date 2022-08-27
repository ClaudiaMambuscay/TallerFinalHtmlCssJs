const main=()=>{
    let option = document.querySelector('#options');
    option.addEventListener("click",cambiarColor)
}


const cambiarColor=()=> {
 
    let option = document.querySelector('#options');
    option.addEventListener("click",cambiarColor)
    let tema = document.querySelector('#tema');

    switch (Number(option.value)){
        case 1:  
            tema.classList.add("tema1");
            
            console.log('El valor es: '+option.value);
            tema.classList.remove("tema2");
            tema.classList.remove("tema3");
            break;
        case 2: 
            
            tema.classList.add("tema2");
           
            console.log('El valor es: '+option.value);
            tema.classList.remove("tema1");
            tema.classList.remove("tema3");
            break;

            
        case 3: 
            tema.classList.add("tema3");
            
            console.log('El valor es: '+option.value);
            tema.classList.remove("tema1");
            tema.classList.remove("tema2");
            
            break;
    } 
   
   
}

/*Mostrar Estudios*/
const mostrar = ()=>{
    let element= document.querySelector('.sec');
    let sec = document.querySelector('.closeBs');
    element.addEventListener('click',()=>{
    sec.classList.remove('closeBs');
    sec.classList.add("Bsactivo");})

    let element2= document.querySelector('.pre');
    let pre = document.querySelector('.closePre');
    element2.addEventListener('click',()=>{
    pre.classList.remove('closePre');
    pre.classList.add("preactivo");})

    let element3= document.querySelector('.pos');
    let pos = document.querySelector('.closePos');
    element3.addEventListener('click',()=>{
    pos.classList.remove('closePos');
    pos.classList.add("posactivo");})

}
/* Mostrar Experiencia Laboral*/
const  mostrar2 =()=>{ /*fuente:https://www.youtube.com/watch?v=XGyTnLoGOX0&t=679s */
const bloque = document.querySelectorAll('.bloque');
const title = document.querySelectorAll('.title');

title.forEach((cadaH3 , i)=>{
    title[i].addEventListener('click', ()=>{
        bloque.forEach((cadaBloque, i)=>{
            bloque[i].classList.remove('activo')
        })
        bloque[i].classList.add('activo')
    })

})
}

/*Mostrar Referencias*/
const  mostrar3 =()=>{ /*fuente:https://www.youtube.com/watch?v=XGyTnLoGOX0&t=679s */
    const bloque = document.querySelectorAll('.bloque');
    const title = document.querySelectorAll('.title');

    title.forEach((cadaH3 , i)=>{
        title[i].addEventListener('click', ()=>{
            bloque.forEach((cadaBloque, i)=>{
                bloque[i].classList.remove('ref')
            })
            bloque[i].classList.add('ref')
        })

    })
}

/*Mostrar Informacion de interes*/
const  mostrar4 =()=>{ /*fuente:https://www.youtube.com/watch?v=XGyTnLoGOX0&t=679s */
    const bloque = document.querySelectorAll('.bloque');
    const title = document.querySelectorAll('.title');

    title.forEach((cadaH3 , i)=>{
        title[i].addEventListener('click', ()=>{
            bloque.forEach((cadaBloque, i)=>{
                bloque[i].classList.remove('information')
            })
            bloque[i].classList.add('information')
        })

    })
}
    
    

