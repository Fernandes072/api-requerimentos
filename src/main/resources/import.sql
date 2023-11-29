INSERT INTO `courses`(course_id, name) VALUES (1, 'Ciência da Computação'),(2, 'Logística'),(3, 'Manutenção e Suporte em Informática'),(4, 'Agronegócio');

INSERT INTO `users`(registration, username, password, name, email, course_id) VALUES (2021004000, 'ana', 'abc', 'Ana Beatriz Pereira', 'ana@email.com', 1), (2018316495, 'lucas', '21', 'Lucas Oliveira Santos', 'lucas@email.com', 2), (2021002364, 'maria', '21', 'Maria Fernanda Costa', 'maria@email.com', 3), (2021003852, 'juliana', '21', 'Juliana da Silva Souza', 'juliana@email.com', 4), (2023001341, 'gabriel', '21', 'Gabriel Pereira Lima', 'gabriel@email.com', 2), (2022141041, 'andre', '21', 'André Luiz Martins', 'andre@email.com', 1), (2021458041, 'carolina', '21', 'Carolina Almeida Castro', 'carolina@email.com', 4), (2020361041, 'thiago', '21', 'Thiago Santos Pereira', 'thiago@email.com', 3), (2019245041, 'camila', '21', 'Camila Oliveira Pereira', 'camila@email.com', 2), (2017185041, 'felipe', '21', 'Felipe da Silva Costa', 'felipe@email.com', 1), (2024144041, 'giovana', '21', 'Giovanna Santos Almeida', 'giovanna@email.com.com', 1);

INSERT INTO `users`(registration, username, password, name, email, course_id, image, administrator) VALUES (2021004041, 'a', 'a', 'João Fernandes Santos Filho', 'joao@email.com', 1, 'image_url', 'yes');

INSERT INTO `requeriments`(requeriment_id, registration, type, specification, reason, send_date) VALUES (1, 2017185041, 'Outros', 'Atividades Complementares', 'Contabilizar cetificados de atividades', '12/12/2012 12:12:12'),(2, 2018316495, 'Exame de Proficiência', null, 'Desejo fazer o exame para a disciplina de Sistemas Operacionais', '12/12/2012 12:12:12'),(3, 2018316495, 'Justificativa de Falta', null, null, '12/12/2012 12:12:12'),(4, 2019245041, 'Trancamento', null, null, '12/12/2012 12:12:12'),(5, 2021003852, 'Transferência', null, null, '12/12/2012 12:12:12'),(6, 2021004000, 'Justificativa de Falta', null, 'Atestado médico para justificar falta do dia 25/12', '12/12/2012 12:12:12'),(7, 2021458041, 'Licença Maternidade', null, null, '12/12/2012 12:12:12'),(8, 2022141041, 'Exame de Proficiência', null, null, '12/12/2012 12:12:12'),(9, 2024144041, 'Equivalência de Disciplina', null, null, '12/12/2012 12:12:12'),(10, 2022141041, 'Colação de Grau', null, null, '12/12/2012 12:12:12');