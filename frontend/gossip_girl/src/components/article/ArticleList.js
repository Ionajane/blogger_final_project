import React from 'react';

const ArticleList = (props) => {
  const articles = props.articles.map((article) => {
    return (
      <li key={article.id} className="article-component-item">
      <div className= "component">
      <Article article={article} />
      </div>
      </li>
    )
  })

  return (
    <ul className="article-component-item">
    {articles}
    </ul>
  )
}

export default ArticleList;
