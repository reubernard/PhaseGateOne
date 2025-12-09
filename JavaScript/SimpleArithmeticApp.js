const input = require('prompt-sync')();

let score = 0;
const maxQuestions = 10;

console.log("Subtraction problem\n");
console.log("Note: You have 10 subtraction questions.");
console.log("You have only 2 attempts per question.\n");

for (let index = 1; index <= maxQuestions; index++) {

    let num1 = Math.floor(Math.random() * 21);
    let num2 = Math.floor(Math.random() * 21);

    if (num2 > num1) {
        let temp = num1;
        num1 = num2;
        num2 = temp;
    }

    let correctAnswer = num1 - num2;

    console.log(`Question ${index}: What is ${num1} - ${num2}?`);

    let answeredCorrectly = false;

    for (let attempt = 1; attempt <= 2; attempt++) {

        let userAnswer = Number(input("Your answer: "));

        if (userAnswer === correctAnswer) {
            console.log("Correct!\n");
            score++;
            answeredCorrectly = true;
            break;
        } else {
            if (attempt === 1) {
                console.log("Wrong. Try again.");
            } else {
                console.log(`Wrong again. Correct answer = ${correctAnswer}\n`);
            }
        }
    }
}

console.log(`Your final score is: ${score}/${maxQuestions}`);
