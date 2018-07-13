elem = document.getElementById("myBtn");
elem.addEventListener("click", // <=> Ajouter un onclick
        function () {
            if(red) {
                document.bgColor='blue';
                red=false;
            }
            else {
                document.bgColor='red';
                red=true;
            }
        }
);

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

var red = true;
var hello = function () {
    if(red) {
        document.bgColor='blue';
        red=false;
    }
    else {
        document.bgColor='red';
        red=true;
    }
}

        function manageForm() {
            var title = document.forms["myForm"].elements["titleBox"].value;
            var price = document.forms["myForm"].elements["priceBox"].value;
            alert(title + " " + price);
        }

        function checkTitle() {
            var title = document.forms["myForm"].elements["titleBox"].value;
            if(title.length == 0) {
                element = document.getElementById("titleError");
                element.style.visibility = "visible";
            }
            else {
                document.getElementById("titleError").style.visibility = "hidden";
            }
        }

        function checkPrice() {
            var price = document.forms["myForm"].elements["priceBox"].value;
            if(price.length == 0) {
                document.getElementById("priceError").style.visibility = "visible";
            }
            else {
                document.getElementById("priceError").style.visibility = "hidden";
            }
            if(isNaN(price)) {
                document.getElementById("priceFormatError").style.visibility = "visible";
            }
            else {
                document.getElementById("priceFormatError").style.visibility = "hidden";
            }
        }

        function changeDiv() {
            var list = document.getElementsByTagName("div");
            for(var i=0;i<list.length;i++) {
                console.log(list[i].textContent);
                list[i].textContent = "Hello"+i;
            }
        }

        function changeWorldDiv() {
            element = document.getElementById("worldId");
            element.textContent = "World Champion";
        }

        function changeGroupDiv() {
            element = document.getElementById("groupDiv");
            list = element.getElementsByTagName("div");
            for(var i=0;i<list.length;i++) {
                console.log(list[i].textContent);
                list[i].textContent = "Hello"+i;
            }
        }

        function changeHello() {
            element = document.getElementsByClassName("hello")[0];
            element.style.fontSize = "30px";
        }

        var isVisible=true;
        function toggleVisible() {
            element = document.getElementsByClassName("hello")[0];
            isVisible = !isVisible;
            if(isVisible) {
                element.style.visibility = "visible";
            }
            else {
                element.style.visibility = "hidden";
            }
        }

        var isEnabled=true;
        function toggleEnabled() {
            element = document.getElementById("myBtn");
            isEnabled = !isEnabled;
            element.style.disabled = true;
        }
