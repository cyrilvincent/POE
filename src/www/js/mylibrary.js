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

function isPrime(i) {
    var res = true;
    for(var j=2;j<i;j++) {
        if(i%j == 0) {
            res = false;
            break;
        }
    }
    return res;
}

function getPrimeNumbers(tab) {
    var res = new Array();
    for(var i=0;i<tab.length;i++) {
        if(isPrime(tab[i])) {
            res.push(tab[i]);
        }
    }
    return res;
}