import React from 'react';
import {Link} from 'react-router-dom';

const Article = (props) => {

  if(!props.article && !props.journalist){
    return null;
  }

  return (
    <React.Fragment>
    <Link to = {"/articles/" + props.article.id}>
      {props.article.title} {props.article.category}
    </Link>
    <p>{props.article.body}</p>
    <p>{props.article.date}</p>
    </React.Fragment>
  )
}

export default Article;
