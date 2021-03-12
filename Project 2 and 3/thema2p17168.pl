sentence(s(NP,VP)) --> noun_phrase(NP),verb_phrase(VP).
pp(pp(PREP,NP)) --> prep(PREP),noun_phrase(NP).
noun_phrase(np(D,N)) --> det(D),noun(N).
verb_phrase(vp(V,NP,PP)) --> verb(V),noun_phrase(NP),pp(PP).
det(det(the)) --> [the].
verb(verb(brought)) --> [brought].
noun(noun(waiter)) --> [waiter].
noun(noun(meal)) --> [meal].
noun(noun(table)) --> [table].
prep(prep(to)) --> [to].

