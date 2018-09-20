

let selectAll = function(){
    // Get all the elements
    const elements = document.getElementsByClassName('class-list-item');

    // Add the .selected class to each one
    for(let i = 0; i < elements.length; i++){
        // Get current element
        const e = elements[i];

        // Add class to current element
        e.classList.add('selected');
    }
}

let unselectAll = function(){
    // Get all the elements
    const elements = document.getElementsByClassName('class-list-item');

    // Remove the .selected class from each one
    for(let i = 0; i < elements.length; i++){
        // Get current element
        const e = elements[i];

        // Remove class to current element
        e.classList.remove('selected');
    }
}

let select= function(){

    this.classList.toggle('selected');

}

let submit = function(){

    const elements = document.getElementsByClassName('selected');

    //elements.forEach((e) => console.log(e.innerText));

    for(let i = 0; i < elements.length; i++){
        const e = elements[i];
        console.log(e.innerText);
    }

}

const elements = document.getElementsByClassName('class-list-item');

for(let i = 0; i < elements.length; i++){
    // Get current element
    const e = elements[i];

    // Adds event listener
    e.addEventListener('click', select);
}


