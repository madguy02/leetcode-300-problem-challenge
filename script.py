# TODO: Individual counts for each topics and difficulty range

import os

count= 0
for root, dir_names, file_names in os.walk(os.getenv('PROBLEM_PATH')):
    for f in file_names:
        fname = os.path.join(root, f)
        if fname.endswith('.java'):
            count = count + 1


print("Total problems done till now is:", count)


