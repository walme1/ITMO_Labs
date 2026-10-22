#Author = Kuskildin Ramir Railevich
#Group = P3118
#Date = 16.10.2026
import re

text = "А ты знал, что ВТ – лучшая кафедра в ИТМО?"

pattern = re.findall(r'\bВТ\b(?:\W+\w+){,4}\W+\bИТМО\b', text)
print(pattern)
