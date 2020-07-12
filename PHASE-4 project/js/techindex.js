
var i = 0;
var correctCount = 0 ;

generate(0);

function generate(technology) {
    document.getElementById("question").innerHTML = jsonData[technology].q;
    document.getElementById("optt1").innerHTML = jsonData[technology].opt1;
    document.getElementById("optt2").innerHTML = jsonData[technology].opt2;
    document.getElementById("optt3").innerHTML = jsonData[technology].opt3;
}

function checkAnswer() {
    if (document.getElementById("opt1").checked && jsonData[i].opt1 == jsonData[i].answer) {
       correctCount++;
    }
    if (document.getElementById("opt2").checked && jsonData[i].opt2 == jsonData[i].answer) {
        correctCount++;
    }
    if (document.getElementById("opt3").checked && jsonData[i].opt3 == jsonData[i].answer) {
        correctCount++;
    }

    i++;
   
    if(jsonData.length-1 < i){
        document.write("<body style='background-image:url(image/green.jpg);'>");
    document.write("<div style='color:#ffffff  ;font-size:35pt;text-align:center;'>*****Your score is : "+correctCount+"*****</div>");
      
    document.write("</body>");
    }
    
    generate(i);
    
}