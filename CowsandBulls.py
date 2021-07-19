import random
def compare_numbers(number, user_guess):
    cow = 0
    bull = 0
    for i in range(len(number)):
        if user_guess[i] == number[i]:
            cow += 1
        else:
            if user_guess[i] in number:
                bull += 1
    return cow, bull
if __name__ == "__main__":
    playing = True 
    number = str(random.randint(1000, 9999))
    guesses = 0

    print("Welcome to the Cows and Bulls Game!")
    print("Gõ exit bất cứ lúc nào để thoát .")

    while playing:
        user_guess = input("Hãy đoán một số: ")
        if user_guess == "exit":
            print("Thoát game.")
            break
        if len(user_guess) != 4:
            print("Câu trả lời không hợp lệ, vui lòng thử lại!")
            continue

        cow, bull = compare_numbers(number, user_guess)
        guesses += 1

        print(f"Bạn có {str(cow)} cows, và {str(bull)} bulls.")

        if user_guess == number:
            playing = False
            print(f"Bạn đã đoán trúng {guesses}! Con số đó là {number}.")
            break
        else:
            print("Bạn đoán sai rồi, thử lại đi.\n")