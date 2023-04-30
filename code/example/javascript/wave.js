function wave(str) {
    let wave = [];
    // Convert original string to lowercase
    let strLower = str.toLowerCase();

    // Loop through the characters of the string
    for (let i = 0; i < str.length; i++) {
        // Check if current character is letter using regular expression
        if (/[a-zA-Z]/.test(str[i])) {
            // Create substring by concatenating the sliced lowercase string from beginning until current index,
            // uppercase current character and sliced lowercase string after the index of the current character until end
            let substr = strLower.slice(0, i) + str[i].toUpperCase() + strLower.slice(i + 1);
            // Push at the end of result list of strings
            wave.push(substr);
        }
    }

    console.log(wave);
    return wave;
}

// Call the function with one input argument
if (process.argv.length > 2) {
    wave(process.argv[2]);
} else {
    console.log("No input string provided.");
}
