def split_numbers(input_file, output_prefix):
    with open(input_file, 'r') as file:
        numbers = file.read().split(',')

    chunk_size = 10000

    for i in range(0, len(numbers), chunk_size):
        chunk = numbers[i:i + chunk_size]
        output_file = f"{output_prefix}_{i // chunk_size + 1}.txt"

        with open(output_file, 'w') as file:
            file.write(','.join(chunk))

if __name__ == "__main__":
    input_file_path = "memberid.txt"  # Change to your input file path
    output_file_prefix = "memberid_split"     # Change to your desired output file prefix

    split_numbers(input_file_path, output_file_prefix)
