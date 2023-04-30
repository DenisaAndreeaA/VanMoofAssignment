import sys

def wave(str):
    wave = []
    # Convert original string to lowercase
    strLower = str.lower()

    # Loop through the characters of the string
    for index in range(len(str)):
        # Check if current character is letter
        if str[index].isalpha():
            # Create substring by concatenating the sliced lowercase string until current index,
            # uppercase current character and sliced lowercase string after the index of the current character
            substr = strLower[:index] + str[index].upper() + strLower[index+1:]
            # Append at the end of result list of strings
            wave.append(substr)

    print(wave)
    return wave


# Call the function with one input argument
if len(sys.argv) > 1:
    wave(sys.argv[1])
else:
    print("No input string provided.")
