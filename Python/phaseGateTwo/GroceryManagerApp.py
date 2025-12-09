print("Welcome to Berny Grocery")
print(" ")
print("1. Add item(s) to the list")
print("2. Remove item(s) from the list")
print("3. Show all items in the grocery list")
print("4. Exit")


grocery_list = []

while True:
    choice = input("Enter your choice (1-4): ")

    if choice == "1":
        item = input("Enter item to add: ")
        grocery_list.append(item)
        print(f"'{item}' added to the grocery list.")

    elif choice == "2":
        item = input("Enter item to remove: ")
        if item in grocery_list:
            grocery_list.remove(item)
            print(f"'{item}' removed from the grocery list.")
        else:
            print(f"'{item}' not found in the list.")

    elif choice == "3":
        if len(grocery_list) == 0:
            print("Your grocery list is empty.")
        else:
            print("Your Grocery List:")
            print(f"{grocery_list}")

    elif choice == "4":
        print("Exiting Berny Grocery Manager App Goodbye!")
        break

    else:
        print("Invalid choice! Please enter a number between 1 and 4.")
