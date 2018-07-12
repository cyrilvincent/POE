function circleArea(rayon) {
    return Math.PI * rayon * rayon;
}

function display(tab) {
    for(var i=0;i<tab.length;i++) {
        document.write(tab[i]+" ");
    }
    document.write("<br/>");
}

function sum(tab) {
    var res = 0;
    for(var i=0;i<tab.length;i++) {
        res += tab[i];
    }
    return res;
}

function max(tab) {
    var max=tab[0];
    for(var i =1;i<tab.length;i++) {
        if(tab[i]>max) {
            max = tab[i];
        }
    }
    return max;
}

function avg(tab) {
    return sum(tab)/tab.length;
}

function isPrimeNumber(i) {

}

function getPrimeNumbers(tab) { // => retourne un tableau de nombre premiers
    // tab.push <=> tab.add de Java
}