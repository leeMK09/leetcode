def solution(answers):
    answer = []
    spo = [
        [1,2,3,4,5],
        [2,1,2,3,2,4,2,5],
        [3,3,1,1,2,2,4,4,5,5]
    ]
    
    cnt = [0, 0, 0]
    
    for i in range(len(answers)):
        answer_val = answers[i]
        if answer_val == spo[0][i % len(spo[0])]:
            cnt[0] += 1
        if answer_val == spo[1][i % len(spo[1])]:
            cnt[1] += 1
        if answer_val == spo[2][i % len(spo[2])]:
            cnt[2] += 1
            
    max_val = max(cnt)
    
    for i in range(len(cnt)):
        if max_val == cnt[i]:
            answer.append(i + 1)
    
    return answer