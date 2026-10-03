/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {

    let c = [];

    for(let i = 0;i<arr.length;i++){

        if(fn(arr[i],i))

        c.push(arr[i]);
    }

    return c;
    
};