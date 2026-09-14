/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {

    let lowerStr = s.toLowerCase().replace(/[^a-z0-9]/g,"");
    let revStr = lowerStr.split("").reverse().join("");
    return lowerStr === revStr;
};