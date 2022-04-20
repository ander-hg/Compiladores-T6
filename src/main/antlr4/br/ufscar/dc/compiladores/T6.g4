grammar T6;


Tipo:	'physical' 
    |	'magic'
    ;
Nivel
    :	'low'
    |	'medium'
    |	'high'
    ;
Skill
    :   'pierce' 
    |   'compose'
    ;
Class
    :	'mage'
    |	'archer'
    |	'warrior'
    ;
IDENT   
    :   ('a'..'z'|'A'..'Z')+
    ;
COMENTARIO
    :   '{' ~('\n'|'\r'|'}')* '\r'? '}' {skip();}
    ;
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();}
    ;

programa
    : 	corpo <EOF>
    ;
corpo
    :	aliado inimigo cmd*
    ;
personagem
    :	id=Class
    |	'name' ':'  id=IDENT ','
        'damage type' ':' Tipo ','
        'armor' ':' armor=Nivel ','
        'magic resist' ':' mr=Nivel (','
        'skill' ':' Skill)?
    ;
aliado
    :	'ally' personagem ';'
    ;
inimigo
    :	'enemy' personagem ';'
    ;
cmd :   cmdSkill
    ;
cmdSkill
    :   'use' '(' ('ally'|'enemy') ',' Skill ')'
    ;
ERROR   
    :   .
    ;
