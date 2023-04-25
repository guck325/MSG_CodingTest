function solution(a, b) {
    
    var num1=a.toString()+b.toString();
    var num2=b.toString()+a.toString();
    if(parseFloat(num1)>parseFloat(num2)) return parseFloat(num1);
    else return parseFloat(num2);
    
}