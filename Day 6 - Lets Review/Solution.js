function processData(input) {
    //Enter your code here
    n = input.split('\n')

    for(let i = 1; i < n.length; i++){
        var arr = n[i].split('');

        var even = '';
        var odd = '';

        for(let j = 0; j < arr.length; j++){
            if(j % 2 == 0){
                even = even + arr[j];
            }else{
                odd = odd +arr[j];
            }
        }
        console.log(even + ' '+ odd);
    }
} 

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input);
});
