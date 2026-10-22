#Author = Kuskildin Ramir Railevich
#Group = P3118
#Date = 16.10.2026
import re
text = str(input())
match = re.findall(r'\bВТ\b(?:\W+\w+){,4}\W+\bИТМО\b', text)
result = []
for pattern in match:
    cleaned = re.sub(r'[^\w\s]', '', pattern)
    cleaned = re.sub(r'\s+', ' ', cleaned)
    result.append(cleaned)
print(result)   