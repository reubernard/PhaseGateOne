import random

score = 0
max_questions = 10

print("SUBTRACTION QUIZ")
print(" ")
print("You will get 10 subtraction questions.")
print("You have 2 attempts per question.\n")


for question_number in range(1, max_questions + 1):

    num1 = random.randint(0, 20)
    num2 = random.randint(0, 20)


    if num2 > num1:
        num1, num2 = num2, num1

    correct_answer = num1 - num2

    print(f"Question {question_number}: What is {num1} - {num2}?")

    answered_correctly = False

    for attempt in range(1, 3):
        user_answer = int(input("Your answer: "))

        if user_answer == correct_answer:
            print("Correct!\n")
            score += 1
            answered_correctly = True
            break
        else:
            if attempt == 1:
                print("Wrong. Try again.")
#                elif user_answer == '':
#                print("Wrong. Try again.")
            else:
                print(f"Wrong again. Correct answer = {correct_answer}\n")

print(f"Your Score: {score} out of {max_questions}")


