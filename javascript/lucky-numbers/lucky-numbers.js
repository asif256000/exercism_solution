// @ts-check

/**
 * Calculates the sum of the two input arrays.
 *
 * @param {number[]} array1
 * @param {number[]} array2
 * @returns {number} sum of the two arrays
 */
export function twoSum(array1, array2) {
  return Number(array1.join("")) + Number(array2.join(""));
}

/**
 * Checks whether a number is a palindrome.
 *
 * @param {number} value
 * @returns {boolean} whether the number is a palindrome or not
 */
export function luckyNumber(value) {
  let strNum = String(value);
  let numLen = strNum.length;
  let middleIndex = numLen % 2 ? numLen / 2 : (numLen - 1) / 2;

  for (let i = 0; i < middleIndex; i++) {
    if (strNum.charAt(i) != strNum.charAt(numLen - i - 1)) {
      return false;
    }
  }
  return true;
}

/**
 * Determines the error message that should be shown to the user
 * for the given input value.
 *
 * @param {string|null|undefined} input
 * @returns {string} error message
 */
export function errorMessage(input) {
  if (!input) return "Required field";
  if (!Number(input) || Number(input) === 0)
    return "Must be a number besides 0";
  return "";
}
