class Solution(object):
    def sortVowels(self, s):
        vowels = sorted([char for char in s if char.lower() in 'aeiou'])
        result_list = list(s)
        vowel_iter = iter(vowels)
        for i in range(len(result_list)):
            if result_list[i].lower() in 'aeiou':
                result_list[i] = next(vowel_iter)
                
        return "".join(result_list)
